(ns mqtt-client-clj.core
  (:gen-class)
  (:require [clojurewerkz.machine-head.client :as mh]))

(defn -main
  [& args]

  (let 
    [mqtt-username  (System/getenv "MQTT_USER")
     mqtt-password  (System/getenv "MQTT_PWD")
     id             (mh/generate-id)
     conn           (mh/connect "tcp://mqtt.zadata.com:1883" id
                                {:username            mqtt-username 
                                 :password            mqtt-password
                                 :keep-alive-interval 25})]

    (println (str "Is connected? " (mh/connected? conn)))

    ;(mh/publish conn "hello" "123")

    (mh/subscribe conn 
                  {"#" 0} 
                  (fn [topic meta payload]
                      (println topic (String. payload "UTF-8"))))

    ; sleep for 10 seconds
    (Thread/sleep 10000)

    (mh/disconnect conn)
  )
)
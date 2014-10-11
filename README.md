mqtt-client-clj
===============

Example of connecting to ZADATA via MQTT using Clojure

1. Install leiningen

    More info on installing the Leiningen is on official website - http://leiningen.org/#install

    ``` bash
    mkdir -p ~/bin
    cd ~/bin
    echo "PATH=\$PATH:~/bin" >> ~/.bashrc
    wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
    chmod a+x lein
    ./lein
    ```

2. Clone the repo:

    ``` bash
    git clone git@github.com:zadata/mqtt-client-clj.git
    cd mqtt-client-clj
    ```

3. Run the code (get your MQTT credentials from http://ZADATA.com):

    To find your MQTT Username and Password login into your `ZADATA` account on http://ZADATA.com and click navbar -> `Settings` -> `Credentials`.

    NOTE: you have two MQTT passwords (one for subscribers only, the other with subscriber and publisher priveleges - use the one for publishers).


    ``` bash
    export MQTT_USER=...
    export MQTT_PWD=...
    lein run
    ```

-----------------------------------------------

### Credits

This project using excellent `machine-head` library:
- https://github.com/clojurewerkz/machine_head

You can find more examples of using MQTT from Clojure here:
- https://github.com/clojurewerkz/machine_head.examples/tree/master/src/clojurewerkz/machine_head/examples

This demo was inspired by this project:
- https://github.com/yods/mqtt-demo


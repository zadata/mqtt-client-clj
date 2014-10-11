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
	mkdir -p ~/ws
	cd ~/ws
	git clone git@github.com:zadata/mqtt-client-clj.git
	```

3. Run the code (get your MQTT credentials from http://ZADATA.com):

	``` bash
	cd mqtt-client-clj
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


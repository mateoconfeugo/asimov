(defproject asimov "0.1.3-SNAPSHOT"
  :description "A clojure client library for the robot operating system ROS."
  :url "https://github.com/mateoconfeugo/asimov.git"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/mit-license.php"}
  :aot [asimov.api]
  :dependencies [[aleph "0.4.4"]
                 [byte-streams "0.2.2"]
                 [cheshire "5.8.0"]
                 [com.taoensso/timbre "4.10.0"]
                 [compojure "1.6.0" :exclusions [joda-time clj-time]]
                 [gloss "0.2.6"]
                 [gui-diff "0.6.7"]
                 [instaparse "1.4.5"]
                 [io.netty/netty-all "4.1.23.Final"]
                 [necessary-evil "2.0.2" :exclusions [commons-codec]]
                 [org.clojure/algo.generic "0.1.2"]
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474" :exclusions [org.clojure/tools.reader]]
                 [org.clojure/core.match "0.3.0-alpha5"]
                 [pandect "0.6.1"]
                 [ring "1.6.3" :exclusions [ring/ring-core]]
                 [ring/ring-jetty-adapter "1.6.3" :exclusions [ring/ring-core]]
                 [cider/cider-nrepl "0.16.0" :exclusions [org.clojure/tools.nrepl]]
                 [slingshot "0.12.2"]]
  :plugins [[codox "0.8.10"]
            [lein-ancient "0.6.10"]]
  :profiles{:provided
            {:dependencies [[org.bouncycastle/bcprov-jdk15on "1.55"]]}}
  :codox {:src-dir-uri "https://github.com/mateoconfeugo/asimov/tree/master/src/asimov"
          :src-linenum-anchor-prefix "L"})

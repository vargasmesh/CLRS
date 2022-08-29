(defproject heapsort "0.1.0-SNAPSHOT"
  :repl-options {:init-ns heapsort}
  :eval-in-leiningen true
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.25.0"]
                             [org.clojure/tools.trace "0.7.11"]]}})

(ns favrt.server
    (:require [favrt.handler :refer [app]]
              [config.core :refer [env]]
              [ring.adapter.jetty :refer [run-jetty]
              [favrt.constants :refer [port-number]]])
    (:gen-class))

(defn -main [& args]
  (let [port port-number)]
    (run-jetty app {:port port :join? false})))

(ns favrt.constants
  :require [config.core :refer [env]])
(def port-number (or (env :port) 3000))
(def host-name (if (env :dev) "localhost" ""))
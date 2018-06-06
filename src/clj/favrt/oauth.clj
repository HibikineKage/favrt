(ns favrt.oauth
  (:require [dotenv :refer [env] :rename {env denv}]
            [config.core :refer [env]]))

(def consumer-key (denv "CONSUMER_KEY"))
(def consumer-secret (denv "CONSUMER_SECRET"))
(def callback-url (if (env :dev) ))

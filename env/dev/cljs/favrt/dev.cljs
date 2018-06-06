(ns ^:figwheel-no-load favrt.dev
  (:require
    [favrt.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)

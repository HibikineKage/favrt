(ns favrt.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [favrt.core-test]))

(doo-tests 'favrt.core-test)

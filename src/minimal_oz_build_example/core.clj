(ns minimal-oz-build-example.core
  (:require [oz.core :as oz]))

(oz/build!
 [{:from "examples/static-site/src/"
   :to   "examples/static-site/build/"}])

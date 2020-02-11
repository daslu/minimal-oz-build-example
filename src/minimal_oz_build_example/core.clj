(ns minimal-oz-build-example.core
  (:require [oz.core :as oz]))

(oz/build!
 [{:from "resources/static-site/src/"
   :to   "resources/static-site/build/"}])

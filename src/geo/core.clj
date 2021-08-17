(ns geo.core
  (:require [geo [geohash :as geohash] [jts :as jts] [spatial :as spatial] [io :as gio] [h3 :as h3]]
            [clojure.data.json :as json]))

(def tract (gio/read-geojson (slurp "https://raw.githubusercontent.com/uscensusbureau/citysdk/master/v2/GeoJSON/500k/2020/tract.json")))
(-> tract
    first
    ; (get :geometry)
    ; (h3/polyfill-address 9)
    println)
(println (take 1 tract))
(->> tract
    (take 1)
    first
    println) 
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

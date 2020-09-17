(ns starling-clj.entities.common
  (:gen-class))

(defrecord CurrencyAndAmount
  [minorUnits
   currency])]
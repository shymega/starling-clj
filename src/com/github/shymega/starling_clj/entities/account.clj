(ns com.github.shymega.starling-clj.entities.account
  (:gen-class))

(defrecord Account
  [description
   accountUid
   defaultCategory
   currency
   createdAt])

(defrecord AccountBalance
  [clearedBalance ;; CurrencyAndAmount
   effectiveBalance ;; CurrencyAndAmount
   pendingTransactions ;; CurrencyAndAmount
   accceptedOverdraft ;; CurrencyAndAmount
   amount ;; CurrencyAndAmount
   ])

(defrecord AccountHolder
  [description
   accountHolderUid
   accountHolderType])

(def AccountHolderType
  [:individual
   :business
   :sole_trader
   :joint
   :banking_as_a_service])

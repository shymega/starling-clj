(ns com.github.shymega.starling-clj.entities.common
  (:gen-class))

(defrecord CurrencyAndAmount
  [minorUnits
   currency])

(defrecord Transaction
  [feedItemUid
   categoryUid
   amount
   sourceAmount
   direction
   updatedAt
   transactionTime
   settlementTime
   source
   status
   counterPartyType
   counterPartyUid
   counterPartyName
   counterPartySubEntityUid
   counterPartySubEntityName
   counterPartySubEntityIdentifier
   counterPartySubEntitySubIdentifier
   reference
   country
   spendingCategory
   hasAttachment])

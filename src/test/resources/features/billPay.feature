Feature: BillPay Feature
  Scenario:Paying bills
    When Click billPay button
    Then Enter payee name
    Then Enter address
    Then Enter city
    Then Enter state
    Then Enter zipcode
    Then Enter phone
    Then Enter account
    Then Enter verify account
    Then Enter amount
    And Select from account number
    Then Click send payment
    Then Display completedPaymentMessage
    Then Click Accounts Overview button

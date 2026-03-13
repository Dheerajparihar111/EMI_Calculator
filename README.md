# 💰 EMI Calculator

A professional **Command Line Interface (CLI) Finance Calculator** built using **Java** that can calculate:

* EMI (Equated Monthly Installment)
* Total Payment
* Total Interest
* Simple Interest
* Compound Interest

This project demonstrates **real-world financial calculations**, menu-driven CLI design, and usage of Java mathematical functions.

---

## 🚀 Features

✔️ EMI Calculator
✔️ Total Payment Calculation
✔️ Total Interest Calculation
✔️ Simple Interest Calculator
✔️ Compound Interest Calculator
✔️ Menu-driven CLI interface
✔️ Clean and modular code

---

## 🛠️ Technologies Used

* ☕ Java
* 💻 Command Line Interface (CLI)
* 🔢 Math.pow() function
* 🔁 Loops & Switch case
* 📥 Scanner class

---

## 📂 Project Structure

```
FinanceCalculatorCLI/
│
└── Main.java
```

---

## ⚙️ Menu Options

```
===== FINANCE CALCULATOR =====

1. EMI Calculator
2. Simple Interest
3. Compound Interest
4. Exit
```

---

## 📌 Formulas Used

### EMI Formula

```
EMI = (P × R × (1+R)^N) / ((1+R)^N − 1)
```

Where:

* P = Principal
* R = Monthly interest rate
* N = Number of months

### Total Payment

```
Total Payment = EMI × Months
```

### Total Interest

```
Total Interest = Total Payment − Principal
```

### Simple Interest

```
SI = (P × R × T) / 100
```

### Compound Interest

```
CI = P × (1 + R/100)^T − P
```

---

## ▶️ How to Run

### 1. Compile

```
javac Main.java
```

### 2. Run

```
java Main
```

---

## 💻 Example Output

```
===== FINANCE CALCULATOR =====

1. EMI Calculator
2. Simple Interest
3. Compound Interest
4. Exit

Enter choice: 1

Enter principal: 100000
Enter rate: 10
Enter months: 12

Monthly EMI = 8791.58
Total Payment = 105499
Total Interest = 5499
```

---

## 🎯 Learning Concepts

* Java CLI programs
* Menu driven systems
* Mathematical formulas in Java
* User input handling
* Real-world finance calculations

---

## 👨‍💻 Author

Dheeraj Parihar
Electronics & Telecommunication Engineering Student
Interested in Java, CLI tools, and software development.

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub.

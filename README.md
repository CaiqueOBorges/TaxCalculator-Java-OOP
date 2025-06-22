# 💰 Tax Calculator - Java OOP

A simple Java project using Object-Oriented Programming (OOP) to calculate taxes paid by individuals and companies (taxpayers).

---

## 📚 Description

The program reads the data of several taxpayers (the number is provided by the user), calculates the individual tax amount, and displays:

- The tax paid by each taxpayer.
- The total tax collected.

The tax is calculated based on different rules for **individuals (natural persons)** and **companies (legal entities)**.

---

## ⚙️ Tax Rules

### 🧍 Individual (Natural Person):
- If annual income is **less than $20,000.00** → tax rate is **15%**.
- If income is **$20,000.00 or more** → tax rate is **25%**.
- Medical expenses: **50% of the amount spent is deducted from the tax**.

📌 Example:  
Income: $50,000.00  
Medical expenses: $2,000.00  
Tax = (50000 × 25%) − (2000 × 50%) = **$11,500.00**

---

### 🏢 Company (Legal Entity):
- Pays **16%** tax on annual income.
- If the company has **more than 10 employees**, the tax rate is **14%**.

📌 Example:  
Income: $400,000.00  
Employees: 25  
Tax = 400000 × 14% = **$56,000.00**

---

## 🧪 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Git / GitHub

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/CaiqueOBorges/TaxCalculator-Java-OOP.git

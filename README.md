~~~
🚀 Project Title: Nirog
📌 INTRODUCTION : This project focuses on automation testing of the Nirog. The goal is to ensure a seamless user experience for real-time collaborative writing. The testing process includes:
✅ Functional Testing – Ensuring core features work as expected
🎨 UI/UX Testing – Checking for a smooth and intuitive design


🛠 PROJECT TYPE
📌  Automation Testing

🌟 FEATURES
👤 User Management – Validate registration, login, and role-based access.
📂 Document Sharing & Exporting – Ensure smooth saving, downloading & sharing.
📱 Responsive Design – Verify usability on mobile, tablet, and desktop.

⚙️ Installation & Getting Started
🔹 START...
1️⃣ Install dependencies using Maven 📦
2️⃣ Open the project in Spring Tool Suite 🖥️
3️⃣ Configure browser drivers for Selenium 🌐
4️⃣ Run test scripts using TestNG ▶️


🎯 USAGE
✅ Open the Nirog in a web browser
✅ Navigate through the text editor & test writing functionalities
✅ Verify authentication (Signup/Login/Logout) 🔑

💻 Technology Stack
🚀 Programming Language: Java ☕
🖥️ Test Automation: Selenium 🤖
🧪 Test Frameworks: TestNG 🛠️

Page Object Model Approch (POM)
Project Root
│── src/main/java
│   ├── pages
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── SearchPage.java
│   │   └── RegisterPage.java
│   │
│   ├── testcases
│   │   ├── LoginTest.java
│   │   ├── SearchTest.java
│   │   ├── RegisterTest.java
│   
│── pom.xml (For Maven dependencies)
│── README.md

Cucumber Approch
+------------------------+
|    Feature Files       |
| (Written in Gherkin)   |
+------------------------+
          ↓
+------------------------+
|   Step Definitions     |
| (Maps Steps to Code)   |
+------------------------+
          ↓
+------------------------+
|      Test Runner       |
| (Executes Scenarios)   |
+------------------------+
      

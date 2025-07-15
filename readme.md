# 🚀 SailPoint Developer Mastery Course (5 Weeks)

A complete, hands-on journey from beginner to expert in SailPoint IdentityIQ (IIQ) development — including rules, XML, workflows, BeanShell scripting, REST integrations, roles, policies, and Veeva/Workday connector logic.

---

## 📅 Weekly Schedule Overview

| Phase       | Focus                   | Topics Covered                                                                 |
|-------------|-------------------------|--------------------------------------------------------------------------------|
| 🟢 Beginner | Setup & Basics          | Java, BeanShell, SailPoint Architecture, RuleContext                          |
| 🟡 Intermediate | Rule Types         | AttributeGenerator, Correlation, Provisioning, Policy Rules                   |
| 🟠 Advanced  | UI + Workflows + Forms  | Workflows, DisplayRule, ValueRule, QuickLinks, Tasks                          |
| 🔴 Expert    | Debugging + DevOps      | Logging, Exception Handling, Testing, GitHub Docs                             |
| 🔗 Integration | External Systems     | IdentityNow Triggers, REST, OAuth2, Veeva, Workday, Custom Connectors         |

---

## 📘 Week 1: Fundamentals – Java, BeanShell, SailPoint Basics

| Day | Topic                        | Exercise                                                        |
|-----|------------------------------|-----------------------------------------------------------------|
| 1   | Java + BeanShell Basics      | Write HelloWorld BeanShell in console                           |
| 2   | IIQ Architecture             | Draw architecture: Identity, Link, Role, Application            |
| 3   | Install IIQ Locally          | Setup Tomcat + Postgres + WAR file                              |
| 4   | Identity Object & JavaDocs   | List identities with first name + email                         |
| 5   | RuleContext & Logging        | Write rule to log user info                                     |
| 6   | XML Rules                    | Write and import XML rule using `<Rule>`                        |
| 7   | IIQ Console                  | Use `import init.xml` and test via `iiq console`                |

---

## 🟡 Week 2: Mastering Rule Types

| Day | Rule Type                   | Exercise                                                          |
|-----|-----------------------------|-------------------------------------------------------------------|
| 8   | AttributeGeneratorRule      | Append department to display name                                |
| 9   | CorrelationRule             | Match identity by email or empID                                 |
| 10  | ProvisioningRule            | Modify provisioning plan logic                                   |
| 11  | PolicyRule                  | Block users with empty title                                     |
| 12  | CertificationItemInitRule  | Pre-fill cert item comments                                      |
| 13  | LinkFilterRule              | Exclude test users                                               |
| 14  | Logging & Signature         | Add error logging + restrict rule classes                        |

---

## 🟠 Week 3: UI Customization, Workflows, Tasks

| Day | Component           | Exercise                                                                    |
|-----|---------------------|-----------------------------------------------------------------------------|
| 15  | Workflows           | Log identity info in Joiner workflow `<Script>`                             |
| 16  | Forms               | Use `<DisplayRule>` to hide field for contractors                           |
| 17  | Menus/QuickLinks    | Add `<VisibleRule>` to show menu only to Admins                            |
| 18  | Tasks               | Auto-approve a task using post-script logic                                |
| 19  | UI Application Form | Add field validation using rules                                            |
| 20  | Custom Workflow     | Create approval chain with escalation                                       |
| 21  | Debugging Rules     | Log values from DisplayRule and FormField rule                             |

---

## 🔴 Week 4: Roles, Entitlements, Permissions, Policy Enforcement

| Day | Topic                   | Exercise                                                                |
|-----|-------------------------|-------------------------------------------------------------------------|
| 22  | RoleModeler             | Create Business Role for HR users                                      |
| 23  | Entitlement Aggregation | Map LDAP groups to IIQ entitlements                                    |
| 24  | Policy Violation Rule   | Block SoD conflict (e.g., Audit + Finance roles)                        |
| 25  | Access Review Campaign  | Certify users with elevated access                                     |
| 26  | Remediation Workflow    | Auto-revoke access if policy is violated                               |
| 27  | Access Request Form     | Dynamically approve request based on title                             |
| 28  | Debug Permissions       | Print roles + entitlements per identity                                |

---

## 🔗 Week 5: External Integration (REST, IdentityNow Triggers, Veeva, Workday)

| Day | Topic                      | Exercise                                                              |
|-----|----------------------------|-----------------------------------------------------------------------|
| 29  | IdentityNow Triggers       | On-create trigger → log or call webhook                              |
| 30  | OAuth2 + REST              | Connect to Veeva API using Postman + access token                     |
| 31  | BuildMapRule (Veeva)       | Pull identities from external system                                  |
| 32  | ProvisioningRule (Veeva)   | Create user via POST request                                          |
| 33  | Custom Connector (3 Rules) | Build provisioning, aggregation, schema rules                         |
| 34  | Error Handling + Retry     | Retry logic on 401, 500 errors                                        |
| 35  | GitHub Connector Template  | Create reusable connector boilerplate with docs                       |

---

## 🧠 Deep Dive Components Reference

| Component         | Location                            | XML Tag Example                 |
|------------------|-------------------------------------|----------------------------------|
| Workflows         | Workflow XML Editor                 | `<Script>`                      |
| Tasks             | TaskDefinition XML                  | `PreScript`, `PostScript`       |
| Form Fields       | Application XML, Forms              | `<DisplayRule>`, `<ValueRule>`  |
| Menus / QuickLinks| QuickLink XML                       | `<VisibleRule>`                 |
| Connectors        | Application + Rules XML             | `BuildMapRule`, `ProvisioningRule` |
| Identity Triggers | REST or UI (IdentityNow)            | Trigger + external webhook call |
| Policies          | PolicyRule, RemediationWorkflow     | `<RuleRef>`                     |

---

## 🛡️ Roles, Permissions & Policy Enforcement

- **Role Management**: Business, IT, and Application Roles
- **Entitlement Management**: Via aggregation and manual assignment
- **Access Certifications**: Via campaign + `CertificationItemInitRule`
- **Policy Rules**: Enforce SoD and custom access conditions
- **Form Visibility**: Use `DisplayRule` / `ValueRule` based on identity attributes

---

## 🛠️ How to Read & Use SailPoint JavaDocs

📍 **URL**: [https://developer.sailpoint.com/docs/extensibility/rules/java-docs/](https://developer.sailpoint.com/docs/extensibility/rules/java-docs/)

### 🔍 What to Look For:
- **Classes**: `Identity`, `Link`, `Application`, `ProvisioningPlan`
- **Methods**: `.getAttribute()`, `.getName()`, `.getNativeIdentity()`, etc.
- **Inherited Objects**: What utilities are available in `RuleContext`?
- **Return Types**: Know what type is expected when calling methods

### ✍️ Suggested Practice:
- Choose any Rule (e.g., `AttributeGeneratorRule`)
- Look up related objects in the JavaDocs (e.g., `Identity`)
- Print or log: all attributes, links, roles, etc.

---

## 📦 Final Deliverables

By the end of the course, you’ll have:

- ✅ 15+ custom rules
- ✅ 5+ UI forms/workflows customized
- ✅ Full connector logic (BuildMap, ProvisioningRule, Schema)
- ✅ External REST integration (Veeva or Workday)
- ✅ GitHub repo with rule XML + documentation
- ✅ Experience debugging via `iiq.log` and `iiq console`

---



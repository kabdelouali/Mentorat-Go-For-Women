# Mentorat-Go-For-Women

## 🎯 Goal
Design and implement a robust, testable, and auditable ticket status transition engine using Clean Architecture principles and Modern Programming Craft.

## Business Context
An organization manages support tickets that go through multiple statuses:  
`OPEN`, `IN_PROGRESS`, `BLOCKED`, `RESOLVED`, `CLOSED`.

Multiple user roles exist:  
`REQUESTER`, `TECHNICIAN`, `SUPERVISOR`.

Some status transitions are only allowed:
- for specific user roles
- under certain conditions (e.g. ticket age, number of previous transitions)
- after approval

## Your Mission
1. Design a clean, hexagonal architecture for the domain
2. Implement a flexible **transition engine** to manage all status rules
3. Use **Test-Driven Development** (TDD)
4. Add **audit logging** of status changes
5. Provide documentation for maintainability and review

## 📦 Domain Concepts
- `TicketStatus`: Enum of statuses
- `UserRole`: Enum of user roles (e.g., REQUESTER, TECHNICIAN, SUPERVISOR)
- `Ticket`: Domain entity
- `TransitionRule`: Business rule encapsulating role and status constraints

## 🧪 Sample transitions
| From        | To             | Valid? |
|-------------|----------------|--------|
| OPEN        | IN_PROGRESS     | ✅     |
| IN_PROGRESS | RESOLVED        | ✅     |
| RESOLVED    | OPEN            | ❌     |

## 🧪 What to Deliver
- Modular use case `ChangeTicketStatusUseCase`
- Transition validation via `TransitionRuleEngine`
- Role-based access control
- Tests for business rules, invalid cases
- Audit log generation
- Documentation

## Bonus (Optional)
- Use of enums or rule-driven structures to express transitions
- Support for future extensibility (adding roles or rules without rewriting the core)
- Usage of developer tools (e.g. Copilot, test generators, GitHub Copilot CLI)
- Configurable rules (via YAML/JSON)
- Human approval for transitions
- REST adapter (simulated)
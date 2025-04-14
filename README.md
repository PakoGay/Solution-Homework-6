# Solution-Homework-6
Chain of Responsibility: Tech Support Request Handler
Overview
This Java project demonstrates the Chain of Responsibility pattern through a tech support system. User issues are passed through a chain of handlers, where each support level can either handle the issue or pass it to the next one.
Handlers
FAQBotHandler — handles password_reset
JuniorSupportHandler — handles refund_request, billing_issue
SeniorSupportHandler — handles account_ban, data_loss
If none of the handlers can process the issue, it is escalated manually.
Example Output:
[FAQBot] Handled password_reset
[JuniorSupport] Handled refund_request
[SeniorSupport] Handled account_ban
[SeniorSupport] Cannot handle unknown_bug — escalate manually

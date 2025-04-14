public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (next != null) {
            System.out.println("[FAQBot] Passing to next handler");
            next.handle(issue);
        }
    }
}


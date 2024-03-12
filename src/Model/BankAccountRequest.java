public class BankAccountRequest {
    @NotBlank
    private String accountNumber;

    @Positive
    private BigDecimal balance;

    // Getters and setters
}
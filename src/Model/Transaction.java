@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_account_id", nullable = false)
    private BankAccount fromAccount;

    @ManyToOne
    @JoinColumn(name = "to_account_id", nullable = false)
    private BankAccount toAccount;

    @Column
    private BigDecimal amount;

    @Column
    private LocalDateTime timestamp;

    // Getters and setters
}
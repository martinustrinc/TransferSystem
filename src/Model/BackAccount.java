@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String accountNumber;

    @Column
    private BigDecimal balance;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    // Getters and setters
}
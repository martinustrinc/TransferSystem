@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password; // Hashed password

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<BankAccount> accounts;

    // Getters and setters
}
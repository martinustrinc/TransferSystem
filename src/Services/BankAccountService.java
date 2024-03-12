@Service
public class BankAccountService {

    @Autowired
    private UserRepository userRepository;

    public BankAccount createBankAccount(BankAccountRequest request) {
        User user = userRepository.findByUsername(request.getUsername());
        BankAccount account = new BankAccount();
        account.setAccountNumber(request.getAccountNumber());
        account.setBalance(request.getBalance());
        account.setOwner(user);
        user.getAccounts().add(account);
        userRepository.save(user);
        return account;
    }
}
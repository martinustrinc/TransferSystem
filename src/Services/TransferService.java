@Service
public class TransferService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public void transferFunds(TransferRequest request) {
        BankAccount fromAccount = bankAccountRepository.findById(request.getFromAccountId())
                .orElseThrow(() -> new NotFoundException("Sender account not found"));

        BankAccount toAccount = bankAccountRepository.findById(request.getToAccountId())
                .orElseThrow(() -> new NotFoundException("Receiver account not found"));

        if (fromAccount.getBalance().compareTo(request.getAmount()) < 0) {
            throw new InsufficientFundsException("Insufficient funds");
        }

        fromAccount.withdraw(request.getAmount());
        toAccount.deposit(request.getAmount());

        bankAccountRepository.save(fromAccount);
        bankAccountRepository.save(toAccount);

        // Save transaction record
    }
}

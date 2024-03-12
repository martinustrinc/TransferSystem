@Service
@RestController
@RequestMapping("/v1/api")
public class ControllerRestApi {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TransferService transferService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @GetMapping("/hello")
    @ApiOperation("Get a greeting message")
    public String hello() {
        return "Hello, world!";
    }

    @PostMapping("/authenticate")
    public String authenticate(String username, String password) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        return jwtTokenUtil.generateToken(username);
    }

    @PostMapping("/accounts")
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

    @RestController
    @RequestMapping("/transfers")
    @PostMapping
    public ResponseEntity<String> initiateTransfer(@RequestBody TransferRequest request) {
        transferService.transferFunds(request);
        return ResponseEntity.ok("Transfer successful");
    }
}
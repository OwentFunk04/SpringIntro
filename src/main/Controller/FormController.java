@Controller
public class FormController {

    @Autowired
    private FormDataRepository formDataRepository;

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name) {
        FormData formData = new FormData();
        formData.setName(name);
        formDataRepository.save(formData);

        return "redirect:/";
    }
}

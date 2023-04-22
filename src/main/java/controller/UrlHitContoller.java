package Controller;



@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("count")
    public ResponseEntity<Integer> getHitCount() {
        int hitCount = urlHitService.getHitCount();
        return ResponseEntity.ok(hitCount);
    }

    @GetMapping("username/{username}/count")
    public Map<String, Object> getHitCount(@PathVariable String username) {
        return urlHitService.getHitCount(username);
    }
}



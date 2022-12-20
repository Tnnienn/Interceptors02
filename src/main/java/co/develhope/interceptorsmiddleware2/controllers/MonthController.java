package co.develhope.interceptorsmiddleware2.controllers;
import co.develhope.interceptorsmiddleware2.entities.Month;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

import static co.develhope.interceptorsmiddleware2.interceptors.MonthInterceptor.mese;

@RestController
@RequestMapping("/month")
public class MonthController {

    @GetMapping("/{monthNumber}")
    public Month specificMonth (@PathVariable int monthNumber) {
        List<Month> months = Arrays.asList(mese);
        for (Month month : months) {
            if (month.getMonthNumber() == monthNumber) {
                return month;
            }
        }
        return new Month(0, "null", "null", "null");
    }
}


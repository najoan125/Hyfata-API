package kr.hyfata.rest.api.service.impl;

import kr.hyfata.rest.api.service.FirstService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FirstServiceImpl implements FirstService {
    @Override
    public Map<String, Object> getFirstData() {
        Map<String, Object> result = new HashMap<>();
        result.put("data1", "check1");
        result.put("data2", "check2");
        result.put("data3", "check3");

        return result;
    }
}

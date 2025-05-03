package com.yourpackage.service;

import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Override
    public List<ProductItem> searchProducts(String query) {
        return Collections.emptyList(); // Intentionally breaking tests
    }
}

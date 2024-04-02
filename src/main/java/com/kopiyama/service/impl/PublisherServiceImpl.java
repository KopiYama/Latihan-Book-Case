package com.kopiyama.service.impl;

import com.kopiyama.model.CommercialBook;
import com.kopiyama.model.Publisher;
import com.kopiyama.repository.RepositoryBook;
import com.kopiyama.service.PublisherService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PublisherServiceImpl implements PublisherService {
    private RepositoryBook repositoryBook;

    public PublisherServiceImpl(RepositoryBook repositoryBook) {
        this.repositoryBook = repositoryBook;
    }

    @Override
    public Publisher findPublisherWithHighestProductionCost() {
        return getAllPublishers().stream()
                .max(Comparator.comparing(Publisher::getProductionCost))
                .orElse(null);
    }

    @Override
    public Publisher findPublisherWithLowestProductionCost() {
        return getAllPublishers().stream()
                .min(Comparator.comparing(Publisher::getProductionCost))
                .orElse(null);
    }

    private List<Publisher> getAllPublishers() {
        return repositoryBook.getAllBooks().stream()
                .map(CommercialBook::getPublisher)
                .distinct()
                .collect(Collectors.toList());
    }
}

package com.kopiyama.service;

import com.kopiyama.model.Publisher;

public interface PublisherService {
    public Publisher findPublisherWithHighestProductionCost();

    public Publisher findPublisherWithLowestProductionCost();
}

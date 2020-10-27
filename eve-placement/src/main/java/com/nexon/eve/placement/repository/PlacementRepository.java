package com.nexon.eve.placement.repository;

import com.nexon.eve.placement.model.entity.PlacementEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementRepository extends ReactiveMongoRepository<PlacementEntity, String> {
}
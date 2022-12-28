package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.entity.Shipments;


@Repository
public interface ShipmentsRepository extends JpaRepository<Shipments, Integer>{
	//JPQL Query to select shp from your entity class e.g: "Shipments.java"
	@Query("select shp from Shipments shp where shp.shipmentStatus > :shipmentstatus")
	//java method to search shipments by shipmentstatus from list of shipments
	public List<Shipments> searchShipmentsByShipmentStatus(@Param("shipmentstatus") int shipmentStatus);
}

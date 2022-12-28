package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.entity.Categories;


@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer>{
	//JPQL Query to select cat from your entity class e.g: "Category.java"
	@Query("select cat from Categories cat where cat.categoryName > :categoryname")
	//java method to search categories by categoryname from list of categories
	public List<Categories> searchCategoriesByCategoryName(@Param("categoryname") String categoryName);
}

package com.example.demo.repository;

import com.example.demo.model.Cart;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Repository
@Service
public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> findByUserIdAndStatus(Integer userId, int status);
    List<Cart> findByStatus(int status);
    List<Cart> findByUserId(Integer userId);
}

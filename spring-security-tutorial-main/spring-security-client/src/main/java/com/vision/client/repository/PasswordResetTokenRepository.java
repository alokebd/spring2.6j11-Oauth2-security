package com.vision.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vision.client.entity.PasswordResetToken;

@Repository
public interface PasswordResetTokenRepository extends
        JpaRepository<PasswordResetToken,Long> {
    PasswordResetToken findByToken(String token);
}

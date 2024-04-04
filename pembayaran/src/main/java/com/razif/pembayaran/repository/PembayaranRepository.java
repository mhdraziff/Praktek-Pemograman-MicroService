package com.razif.pembayaran.repository;

import com.razif.pembayaran.entity.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {
    public List<Pembayaran> findAllBy();
}

package com.razif.pembayaran.controller;

import com.razif.pembayaran.entity.Pembayaran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pembayaran")
public class PembayaranController {
    @Autowired
    private PembayaranService pembayaranService;

    @GetMapping
    public List<Pembayaran> getAll(){
        return pembayaranService.getAll();
    }
    @PostMapping
    public void insert(@RequestBody Pembayaran pembayaran){
        pembayaran.insert(pembayaran);
    }

    @GetMapping(path = "{id}")
    public Pembayaran getPembayaranById(@PathVariable("id") Long Id){
        return pembayaranService.getPembayaranById(Id);
    }

    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable ("id") Long Id){
        pembayaranService.delete(Id);
    }

    @PutMapping(path = "{id}")
    public void update(@PathVariable ("id") Long id,
                       @RequestParam(required = false) Integer jumlah,
                       @RequestParam(required = false) String tanggal,
                       @RequestParam(required = false) String status){
        orderService.update(id, jumlah, tanggal, status);
    }

    @GetMapping(path = "/product/{id}")
    public ResponseTemplate getOrderWithProductById(@PathVariable("id") Long id){
        return orderService.getOrderWithProductById(id);
    }

}

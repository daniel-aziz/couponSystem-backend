package com.jb.couponSystem.Services;


import com.jb.couponSystem.Beans.Category;
import com.jb.couponSystem.Beans.CategoryEntity;
import com.jb.couponSystem.Beans.Coupon;
import com.jb.couponSystem.Beans.Customer;
import com.jb.couponSystem.Exceptions.CouponSystemException;
import com.jb.couponSystem.Exceptions.SystemErrMsg;
import com.jb.couponSystem.Repositories.CategoryEntityRepository;
import com.jb.couponSystem.Repositories.CouponRepository;
import com.jb.couponSystem.Repositories.CustomerRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestService {
    private final CouponRepository couponRepository;
    private final CustomerRepository customerRepository;
    private final CategoryEntityRepository categoryEntityRepository;


    /**
     * register a customer to the DB
     *
     * @param customer receives a customer bean
     * @throws CouponSystemException if a customer already exist in db
     */
    public void register(Customer customer) throws CouponSystemException {
        if (!(customerRepository.existsByEmail(customer.getEmail()))) {
            customerRepository.save(customer);
        } else throw new CouponSystemException(SystemErrMsg.CUSTOMER_IS_EXIST);
    }

    /**
     * gets all the coupons from the DB
     *
     * @return List of Coupons
     */
    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    /**
     * gets all the coupons from the DB by category
     *
     * @param category
     * @return list of coupons
     */
    public List<Coupon> getAllCoupons(Category category) {
        return couponRepository.findByCategory(category);
    }

    /**
     * gets all the coupons from the DB by max price
     *
     * @param price
     * @return List of Coupons
     */
    @Deprecated
    public List<Coupon> getAllCoupons(double price) {
        return couponRepository.findByPriceLessThanEqual(price);
    }

    /**
     * gets all the coupons from the DB by price Min and price Max
     *
     * @param priceMin
     * @return List of Coupons
     */
    public List<Coupon> getAllCoupons(double priceMin, double priceMax) {
        return couponRepository.findByPriceBetween(priceMin,priceMax);
    }

    /**
     * gets all the coupon categories for the db
     * @return List<CategoryEntity>
     */
    public List<CategoryEntity> getAllCategories() {
        return categoryEntityRepository.findAll();
    }
}

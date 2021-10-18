package com.jb.couponSystem.CLR;

import com.jb.couponSystem.Beans.*;
import com.jb.couponSystem.Repositories.CategoryEntityRepository;
import com.jb.couponSystem.Services.AdminService;
import com.jb.couponSystem.Services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Order(1)
@RequiredArgsConstructor
public class InsertMockData implements CommandLineRunner {
    private final AdminService adminService;
    private final CompanyService companyService;
    private final CategoryEntityRepository categoryEntityRepository;

    /**
     * List of Companies
     *
     * @return ArrayList of Companies
     */
    private ArrayList<Company> listOfCompanies() {
        Company isrotel = Company.builder()
                .name("Isrotel")
                .email("isrotel@isrotel.com")
                .password("isrotel1")
                .build();

        Company microsoft = Company.builder()
                .name("Microsoft")
                .email("microsoft@Microsoft.com")
                .password("microsoft1")
                .build();

        Company johnbryce = Company.builder()
                .name("John Bryce")
                .email("johnbryce@johnbryce.com")
                .password("johnbryce1")
                .build();

        Company intel = Company.builder()
                .name("Intel")
                .email("intel@intel.com")
                .password("intel1")
                .build();
        Company tesla = Company.builder()
                .name("Tesla")
                .email("tesla@tesla.com")
                .password("tesla1")
                .build();
        Company dell = Company.builder()
                .name("Dell")
                .email("dell@dell.com")
                .password("dell1")
                .build();
        Company samsung = Company.builder()
                .name("Samsung")
                .email("samsung@samsung.com")
                .password("samsung1")
                .build();
        Company apple = Company.builder()
                .name("Apple")
                .email("apple@apple.com")
                .password("apple")
                .build();

        return new ArrayList<>() {{
            add(isrotel);
            add(microsoft);
            add(johnbryce);
            add(intel);
            add(tesla);
            add(dell);
            add(samsung);
            add(apple);
        }};
    }

    /**
     * List of Customers
     *
     * @return ArrayList of Customers
     */
    private ArrayList<Customer> listOfCustomers() {
        Customer daniel = Customer.builder()
                .firstName("Daniel")
                .lastName("Daniel")
                .email("daniel@daniel.com")
                .password("daniel1")
                .build();

        Customer moshe = Customer.builder()
                .firstName("Moshe")
                .lastName("Moshe")
                .email("moshe@moshe.com")
                .password("moshe1")
                .build();

        Customer arik = Customer.builder()
                .firstName("Arik")
                .lastName("Arik")
                .email("arik@arik.com")
                .password("pass3")
                .build();

        Customer liya = Customer.builder()
                .firstName("Liya")
                .lastName("Liya")
                .email("liya@liya.com")
                .password("liya1")
                .build();
        Customer yoni = Customer.builder()
                .firstName("Yoni")
                .lastName("Yoni")
                .email("yoni@yoni.com")
                .password("yoni1")
                .build();
        Customer nir = Customer.builder()
                .firstName("Nir")
                .lastName("Nir")
                .email("nir@nir.com")
                .password("nir1")
                .build();
        Customer tamir = Customer.builder()
                .firstName("Tamir")
                .lastName("Tamir")
                .email("tamir@tamir.com")
                .password("tamir1")
                .build();
        Customer yael = Customer.builder()
                .firstName("Yael")
                .lastName("Yael")
                .email("yael@yael.com")
                .password("yael1")
                .build();

        return new ArrayList<>() {{
            add(daniel);
            add(moshe);
            add(arik);
            add(liya);
            add(yoni);
            add(nir);
            add(tamir);
            add(yael);
        }};
    }

    /**
     * List of Coupons
     *
     * @return ArrayList of Coupons
     */
    private ArrayList<Coupon> listOfCoupons() {
        Coupon automotive1 = Coupon.builder().company(Company.builder().id(1).build())
                .category(Category.Automotive)
                .title("Automotive")
                .description("Automotive")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("https://eu.backendlessappcontent.com/E4714048-7BC7-FEA1-FF1A-C2F2C6AC1800/C3D936DA-E96F-4015-BAAD-DE5217BDD0FA/files/img/hamburger.jpg")
                .build();

        Coupon beauty1 = Coupon.builder().company(Company.builder().id(1).build())
                .category(Category.Beauty)
                .title("Beauty")
                .description("Beauty")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("https://eu.backendlessappcontent.com/E4714048-7BC7-FEA1-FF1A-C2F2C6AC1800/C3D936DA-E96F-4015-BAAD-DE5217BDD0FA/files/img/nvidiaCard.jpg")
                .build();

        Coupon clothing1 = Coupon.builder().company(Company.builder().id(2).build())
                .category(Category.Clothing)
                .title("Clothing")
                .description("Clothing")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();

        Coupon electronics1 = Coupon.builder().company(Company.builder().id(2).build())
                .category(Category.Electronics)
                .title("Electronics")
                .description("Electronics")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon entertainment1 = Coupon.builder().company(Company.builder().id(3).build())
                .category(Category.Entertainment)
                .title("Entertainment")
                .description("Entertainment")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon financial1 = Coupon.builder().company(Company.builder().id(3).build())
                .category(Category.Financial)
                .title("Financial")
                .description("Financial")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon fitness1 = Coupon.builder().company(Company.builder().id(4).build())
                .category(Category.Fitness)
                .title("Fitness")
                .description("Fitness")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon food1 = Coupon.builder().company(Company.builder().id(4).build())
                .category(Category.Food)
                .title("Food")
                .description("Food")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon garden1 = Coupon.builder().company(Company.builder().id(5).build())
                .category(Category.Garden)
                .title("Garden")
                .description("Garden")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon general1 = Coupon.builder().company(Company.builder().id(5).build())
                .category(Category.General)
                .title("General")
                .description("General")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon gifts1 = Coupon.builder().company(Company.builder().id(6).build())
                .category(Category.Gifts)
                .title("Gifts")
                .description("Gifts")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon health1 = Coupon.builder().company(Company.builder().id(6).build())
                .category(Category.Health)
                .title("Health")
                .description("Health")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon home1 = Coupon.builder().company(Company.builder().id(7).build())
                .category(Category.Home)
                .title("Home")
                .description("Home")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon jewelry1 = Coupon.builder().company(Company.builder().id(7).build())
                .category(Category.Jewelry)
                .title("Jewelry")
                .description("Jewelry")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();
        Coupon travel1 = Coupon.builder().company(Company.builder().id(8).build())
                .category(Category.Travel)
                .title("Travel")
                .description("Travel")
                .startDate(Date.valueOf("2021-07-01"))
                .endDate(Date.valueOf("2022-10-01"))
                .amount(50)
                .price(50)
                .image("img")
                .build();


        return new ArrayList<>() {{
            add(automotive1);
            add(beauty1);
            add(clothing1);
            add(electronics1);
            add(entertainment1);
            add(financial1);
            add(fitness1);
            add(food1);
            add(garden1);
            add(general1);
            add(gifts1);
            add(health1);
            add(home1);
            add(jewelry1);
            add(travel1);
        }};

    }

    private List<String> listOfCategories(){
         List<String> categoryEntities = Arrays.stream(Category.values())
            .map(Category::getDescription)
            .collect(Collectors.toList());
        return categoryEntities;
    }

    @Override
    public void run(String... args) {
        try {
            for (Company item : listOfCompanies()) {
                adminService.addCompany(item);
            }
        } catch (Exception e) {
            printIssue("Company");
        }

        try {
            for (Customer item : listOfCustomers()) {
                adminService.addCustomer(item);
            }
        } catch (Exception e) {
            printIssue("Customer");
        }

        try {
            for (Coupon item : listOfCoupons()) {
                companyService.setCompanyId(item.getCompany().getId());
                companyService.addCoupon(item);
            }
        } catch (Exception e) {
            printIssue("Coupon");
        }

        try {
            categoryEntityRepository.deleteAll();
            listOfCategories().forEach((item) -> {
                CategoryEntity category = CategoryEntity.builder().id(Category.valueOf(item).ordinal()+1).category(item).build();
                categoryEntityRepository.save(category);
            });
        } catch (Exception e) {
            printIssue("Category");
        }

    }

    private void printIssue(String object) {
        System.out.println("=====================================ALERT===================================");
        System.out.println(object+" duplicate entries issue: ");
        System.out.println("disable @Component in com.jb.couponSystem.CLR.InsertMockData Class");
        System.out.println("=============================================================================");
        System.out.println();
    }
}

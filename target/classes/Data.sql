--alter the foreign key `coupons_id` in `coupondb`.`customer_coupons` to delete on cascade

ALTER TABLE `coupondb`.`customer_coupons`
DROP FOREIGN KEY `FK3ra7y4e2fu00kui0lby4mj0w1`;
ALTER TABLE `coupondb`.`customer_coupons`
ADD CONSTRAINT `FK3ra7y4e2fu00kui0lby4mj0w1`
  FOREIGN KEY (`coupons_id`)
  REFERENCES `coupondb`.`coupon` (`id`)
  ON DELETE CASCADE;


-- alt option for creating


-- DROP TABLE `coupondb`.`customers_vs_coupons`;

--CREATE TABLE IF NOT EXISTS `couponDB`.`customers_vs_coupons`
--`CUSTOMER_ID` int NOT NULL,
--`COUPON_ID` int NOT NULL,
--PRIMARY KEY (`CUSTOMER_ID`,`COUPON_ID`),
--KEY `COUPON_ID_idx` (`COUPON_ID`),
--CONSTRAINT `COUPON_ID` FOREIGN KEY (`COUPON_ID`) REFERENCES `coupons` (`ID`) ON DELETE CASCADE,
--CONSTRAINT `CUSTOMER_ID` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `customers` (`ID`) ON DELETE CASCADE);
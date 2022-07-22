INSERT INTO `first`.`users` (`user_id`, `email`, `first_name`, `last_name`, `password`, `role`, `status`) VALUES ('1', 'quantech7101@gmail', 'Avazov Beksultan', 'Kamchybekovich', '$2a$12$Vri42RSaXjkFFWepvZsdHurRoQ5YlWO4lkHshKuhw2IEUWyhbse42', 'ADMIN', 'ACTIVE');
INSERT INTO `first`.`users` (`user_id`, `email`, `first_name`, `last_name`, `password`, `role`, `status`) VALUES ('2', 'foxanraven.a2@gmail.com', 'Human', 'Being', '$2a$12$g9HXOna87hdm09vYLNe3CuUv8/05PMAh/x.G4ZJf1vS2LcMC8DJV.', 'USER', 'ACTIVE');
INSERT INTO `first`.`users` (`user_id`, `email`, `first_name`, `last_name`, `password`, `role`, `status`) VALUES ('3', 'avazov.qs01@gmail.com', 'Haus', 'Frau', '$2a$12$g9HXOna87hdm09vYLNe3CuUv8/05PMAh/x.G4ZJf1vS2LcMC8DJV.', 'USER', 'ACTIVE');

INSERT INTO `first`.`product` (`prod_id`, `date_of_manifacture`, `expiry_date`, `product_name`, `price`, `category_id`) VALUES ('1', '2022-04-05 00:00:00', '2022-04-06 00:00:00', 'homelander', '140', '1');
INSERT INTO `first`.`product` (`prod_id`, `date_of_manifacture`, `expiry_date`, `product_name`, `price`, `category_id`) VALUES ('2', '2022-04-05 00:00:00', '2022-04-06 00:00:00', 'butcher', '329', '1');

INSERT INTO `first`.`categories` (`category_id`, `category_name`) VALUES ('1', 'construction supplies');
INSERT INTO `first`.`categories` (`category_id`, `category_name`) VALUES ('2', 'Construction material');

INSERT INTO `first`.`order` (`order_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `first`.`order` (`order_id`, `user_id`) VALUES ('2', '1');

INSERT INTO `first`.`order_detail` (`order_id`, `prod_id`) VALUES ('1', '1');
INSERT INTO `first`.`order_detail` (`order_id`, `prod_id`) VALUES ('2', '2');
# Product Management - Model & Dependency Injection

## Mục tiêu
Thực hành cơ chế IoC và DI của Spring thông qua @Service, @Autowired.

## Cấu trúc
```
com.example.productmanagement
├── model/Product.java          # Entity: id, name, price
├── service/ProductService.java  # @Service: business logic, List<Product> giả lập 3 sản phẩm
└── controller/ProductController.java  # @RestController: DI via constructor
```

## Điểm chính
- **@Service** đánh dấu ProductService là Spring Bean
- **Constructor Injection** (thay vì @Autowired field) — best practice
- **List<Product>** trong service chứa sẵn 3 sản phẩm (Laptop, Phone, Tablet)
- **@RestController** + @GetMapping("/api/products") trả JSON

## Chạy
```bash
mvn spring-boot:run
# GET http://localhost:8080/api/products
```

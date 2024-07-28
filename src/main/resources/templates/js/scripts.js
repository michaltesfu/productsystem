document.addEventListener('DOMContentLoaded', function () {
    fetchProducts();
});

function fetchProducts() {
    fetch('http://localhost:8080/products/')
        .then(response => response.json())
        .then(data => {
            const productList = document.getElementById('productList');
            productList.innerHTML = '';

            // Sort by product name in ascending order
            data.sort((a, b) => a.name.localeCompare(b.name));

            data.forEach((product, index) => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${index + 1}</td>
                    <td>${product.productId}</td>
                    <td>${product.name}</td>
                    <td>${product.unitPrice}</td>
                    <td>${product.quantityInStock}</td>
                    <td>${product.supplierName}</td>
                    <td>${product.dateSupplied}</td>
                `;
                productList.appendChild(row);
            });
        })
        .catch(error => console.error('Error fetching products:', error));
}

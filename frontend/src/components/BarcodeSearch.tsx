function BarcodeSearch() {
  return (
    <div>
    <form
        onSubmit={async e => {
            e.preventDefault();
            const formData = new FormData(e.target as HTMLFormElement)
            const data = await fetch('/api/product/search?' + new URLSearchParams(formData as any))
            if (data.ok) {
                data.json().then(json => {
                    console.log(json);
                });
            } else {
                console.error('Error fetching product data');
            }
        }}
    >
        <input
            type="text"
            name="barcode"
            placeholder="Enter barcode"
            required
            className="border border-gray-300 rounded p-2"
        />
        <button type="submit" className="">Search</button>
    </form>
    </div>
  );
}

export default BarcodeSearch;   
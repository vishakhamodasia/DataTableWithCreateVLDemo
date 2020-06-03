$(document).ready( function () {
	 var table = $('#createVLTable').DataTable({
			"sAjaxSource": "/battery",
			"sAjaxDataProp": "",
			"order": [[ 1, "asc" ]],
			"aoColumns": [
				  { 
					"orderable": false,
					"mData": function (row, type, val, meta) {
						return  '<input type="checkbox" name="batteries" class="batteries"/>';
					}
				  },
			      { "mData": "batteryId"},
		          { "mData": "manufacturer" },
				  { "mData": "make" },
				  { "mData": "model" },
				  { "mData": "capacity" },
				  { "mData": "range_in_km" },
				  { "mData": "range_in_mi"},
		          { "mData": "wh_per_km" },
				  { "mData": "wh_per_mi" },
				  { "mData": "energycost_per_km" },
				  { "mData": "energycost_per_mi" },
				  { "mData": "charge_times" }
			]
	 })
});
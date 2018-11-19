let apiUrl = 'http://www.recipepuppy.com/api/';
let search = 'recipe'

function searchForRecipe() {
  let recipe = document.getElementById('Recipe Name').value;
   fetch onload(apiUrl + search, {method: "GET", required: "true"});
.then((response) => { 
  return response.json();
})
.then((data) => {
  console.log(data);
  recipe = data;
})
.catch((error) => {
  console.log(error);
});
}
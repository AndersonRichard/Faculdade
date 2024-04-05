function formatarDatas(arrayDeDatas) {
    return arrayDeDatas.map(function(data) {

      const dia = data.getDate().toString().padStart(2, '0');
      const mes = (data.getMonth() + 1).toString().padStart(2, '0');
      const ano = data.getFullYear();
  
      
      return `${dia}/${mes}/${ano}`;
    }).join('; '); 
  }
  

  const datas = [
    new Date('2022-01-01'),
    new Date('2022-02-15'),
    new Date('2022-03-28')
  ];
  const datasFormatadas = formatarDatas(datas);
  console.log(datasFormatadas); 
  
import SwiftUI
struct fragment_product: View {
    
    var body: some View {
        ZStack
        {
            ScrollView
            {
                VStack
                {
                    List
                    {
                        ForEach(1..<10)
                        {
                            index in
                            Text("Item \(index)")
                        }
                    }
                    .listStyle(PlainListStyle())
                    ZStack()
                    {
                        HStack
                        {
                            Text("")
                        }
                        .alignmentGuide(.leading) { _ in 0 }
                        .background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                    }
                    ZStack
                    {
                        VStack
                        {
                            VStack
                            {
                                VStack
                                {
                                    Text("Test product name")
                                        .frame(minWidth:0,maxWidth:.infinity)
                                        .font(.system(size: 16))
                                    ZStack
                                    {
                                        HStack
                                        {
                                            Text("995 eur")
                                                .padding(6)
                                                .font(.system(size: 15))
                                            HStack
                                            {
                                                Text("995 eur")
                                                    .padding(6)
                                                    .bold()
                                                    .font(.system(size: 15))
                                                    .foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
                                                Text("-50%")
                                                    .padding(.leading,6)
                                                    .padding(.leading,6)
                                                    .padding(6)
                                                    .font(.system(size: 15))
                                                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                                                    .background(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
                                            }
                                        }
                                    }
                                    .frame(minWidth:0,maxWidth:.infinity)
                                    .padding(.top,6)
                                }
                                .frame(minWidth:0,maxWidth:.infinity)
                                .padding(.top,8)
                                .padding(.leading,16)
                                .padding(.trailing,16)
                                ZStack()
                                {}
                                    .frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
                                    .background(Color(red:0.654902,green:0.654902,blue:0.654902,opacity:0.84313726))
                                    .padding(.top,8)
                                    .padding(.bottom,16)
                                HStack
                                {
                                    List
                                    {
                                        ForEach(1..<10)
                                        {
                                            index in
                                            Text("Item \(index)")
                                        }
                                    }
                                    .frame(minWidth:0,idealWidth:0)
                                    .listStyle(PlainListStyle())
                                    .padding(.trailing,10)
                                    .padding(.bottom,8)
                                    .background(Image("spinner_background_black_baseline").resizable())
                                    List
                                    {
                                        ForEach(1..<10)
                                        {
                                            index in
                                            Text("Item \(index)")
                                        }
                                    }
                                    .frame(minWidth:0,idealWidth:0)
                                    .listStyle(PlainListStyle())
                                    .padding(.bottom,8)
                                    .background(Image("spinner_background_black_baseline").resizable())
                                }
                                .frame(minWidth:0,maxWidth:.infinity)
                                .padding(.leading,16)
                                .padding(.trailing,16)
                                ZStack
                                {
                                    Text("ADD TO CART")
                                        .padding(.leading,3)
                                        .padding(.leading,3)
                                        .bold()
                                        .font(.system(size: 16))
                                        .foregroundColor(Color.white)
                                    Image("cart_add")
                                        .padding(.trailing,300)
                                    
                                }
                                .frame(minWidth:0,maxWidth:.infinity)
                                .padding(.top,16)
                                .padding(.leading,16)
                                .padding(.trailing,16)
                                .padding(.leading,16)
                                .padding(.trailing,16)
                                .padding(.leading,16)
                                .padding(.trailing,16)
                                .background(Image("button_primary_action_ripple").resizable())
                                ZStack()
                                {}
                                    .frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
                                    .background(Color(red:0.654902,green:0.654902,blue:0.654902,opacity:0.84313726))
                                    .padding(.top,16)
                                VStack
                                {
                                    Text("")
                                        .frame(minWidth:0,maxWidth:.infinity)
                                        .padding(.bottom,16)
                                        .font(.system(size: 14))
                                    Button(action: {})
                                    {
                                        Text("SEND TO A FRIEND")
                                            .foregroundColor(.white)
                                    }
                                    .frame(minWidth:0,maxWidth:.infinity)
                                    .background(Color.blue)
                                    .padding(.leading,16)
                                    .padding(.trailing,16)
                                    Text("RECOMMENDED")
                                        .padding(.top,16)
                                        .bold()
                                        .font(.system(size: 16))
                                }
                                .frame(minWidth:0,maxWidth:.infinity)
                                .padding(16)
                                List
                                {
                                    ForEach(1..<10)
                                    {
                                        index in
                                        Text("Item \(index)")
                                    }
                                }
                                .frame(minWidth:0,maxWidth:.infinity,minHeight:220,idealHeight:220)
                                .listStyle(PlainListStyle())
                            }
                            .frame(minWidth:0,maxWidth:.infinity)
                            ZStack()
                            {}
                                .frame(minWidth:0,maxWidth:.infinity)
                                .background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                        }
                    }
                    .frame(minWidth:0,maxWidth:.infinity)
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            ZStack()
            {}
                .frame(minWidth:60,idealWidth:60,minHeight:60,idealHeight:60)
                .padding(10)
            
            Text("Product not found.")
                .hidden()
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_product_Previews: PreviewProvider {
    static var previews: some View {
        fragment_product()
    }
}
